package phuong;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;

public class MyIssueDAO {

	private static String myIndex = "phuong";
	private static String myType = "issue";

	public static String getIssue(String id) {

		RestHighLevelClient client = MyIssueUtility.getClient();

		GetRequest getRequest = new GetRequest(myIndex, myType, id);

		try {
			GetResponse getResponse = client.get(getRequest);
			String sourceAsString = getResponse.getSourceAsString();

			return sourceAsString;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static List<String> getAllIssue() {

		List<String> list = new ArrayList<String>();
		RestHighLevelClient client = MyIssueUtility.getClient();

		try {
			SearchRequest searchRequest = new SearchRequest();
			searchRequest.indices(myIndex);
			searchRequest.types(myType);

			SearchResponse searchResponse = client.search(searchRequest);
			SearchHits hits = searchResponse.getHits();

			for (SearchHit hit : hits) {

				String sourceAsString = hit.getSourceAsString();
				System.out.println(sourceAsString);

				list.add(sourceAsString);

				// Map<String, Object> sourceAsMap = hit.getSourceAsMap();
				// String documentSubject = (String) sourceAsMap.get("subject");
				// System.out.println(documentSubject);

			}

			// MyIssueUtility.closeClient();
			return list;

		} catch (IOException e) {
			e.printStackTrace();

			MyIssueUtility.closeClient();
			return null;
		}

	}
	
	
	public static String delIssue(String id) {

		RestHighLevelClient client = MyIssueUtility.getClient();

		DeleteRequest request = new DeleteRequest(myIndex, myType, id);
		try {
			DeleteResponse deleteResponse = client.delete(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
