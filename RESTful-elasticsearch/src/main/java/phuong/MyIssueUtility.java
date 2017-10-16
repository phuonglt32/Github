package phuong;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

public class MyIssueUtility {
	private static RestClient restClient = RestClient //
			.builder(new HttpHost("10.225.3.252", 9200, "http")).build();

	public static RestHighLevelClient getClient() {

		return new RestHighLevelClient(restClient);
	}

	public static void closeClient() {
		try {
			restClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
