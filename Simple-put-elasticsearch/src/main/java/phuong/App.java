package phuong;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import com.google.gson.Gson;
import com.taskadapter.redmineapi.IssueManager;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.Issue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("http.proxyHost", "10.225.3.1");
		System.setProperty("http.proxyPort", "3128");
		System.setProperty("https.proxyHost", "10.225.3.1");
		System.setProperty("https.proxyPort", "3128");

		String uri = "http://apis.ifisolution.local:8080";
		String user = "fresher12";
		String password = "12345678";
		String projectKey = "training-project";
		Integer queryId = null; // any

		RedmineManager mgr = RedmineManagerFactory.createWithUserAuth(uri, user, password);
		IssueManager issueManager = mgr.getIssueManager();
		List<Issue> issuesList;

		RestClient restClient = RestClient
				.builder(new HttpHost("dianna.ifisolution.local", 9200, "http")).build();
		RestHighLevelClient client = new RestHighLevelClient(restClient);
		
		try {

			issuesList = issueManager.getIssues(projectKey, queryId);
			for (Issue issue : issuesList) {
				
				// restructure Issue to MyIssue
				MyIssue myIssue = new MyIssue();

				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				myIssue.setId(issue.getId() + "");
				myIssue.setSubject(issue.getSubject());
				myIssue.setParentId(issue.getParentId() + "");
				myIssue.setEstimatedHours(issue.getEstimatedHours() + "");
				myIssue.setSpentHours(issue.getSpentHours() + "");
				myIssue.setAssignee(issue.getAssignee().getFullName());
				myIssue.setPriorityText(issue.getPriorityText());
				myIssue.setDoneRatio(issue.getDoneRatio() + "");
				myIssue.setProject(issue.getProject().getName());
				myIssue.setAuthor(issue.getAuthor().getFullName());
				
				myIssue.setStartdate(dateFormat.format(issue.getStartDate()));				
				myIssue.setDuedate(dateFormat.format(issue.getDueDate()));
				
				myIssue.setTracker(issue.getTracker().getName());
				myIssue.setDescription(issue.getDescription());
				
				myIssue.setCreatedOn(dateTimeFormat.format(issue.getCreatedOn()));
				myIssue.setUpdatedOn(dateTimeFormat.format(issue.getUpdatedOn()));
				
				myIssue.setStatus(issue.getStatusName());
				
				myIssue.setCategory(issue.getCategory() + "");
				
				// convert myIssue to json
				Gson gson = new Gson();
				String myIssueJson = gson.toJson(myIssue);
				System.out.println(myIssueJson);
				
				// index to ES
				IndexRequest request = new IndexRequest("phuong", "issue", myIssue.getId());
				request.source(myIssueJson, XContentType.JSON);
				client.index(request);
			}
			
			restClient.close();

		} catch (RedmineException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
    }
}
