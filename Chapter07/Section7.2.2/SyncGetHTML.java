import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class SyncGetHTML {
    public static void main(String args[]) throws Exception {
		// 基本的なHttpClientインスタンス
        HttpClient client = HttpClient.newHttpClient();

        // URIだけで基本的なHttpRequestインスタンスを得るためにビルダパターンを使う
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://www.ejavaguru.com/"))
            .build();

        // ビルダを使わずに作成されたHTTPResponseのインスタンス
        // HttpClientはHttpRequestsを送信して、HttpResponseを利用可能にします
        HttpResponse<String> response = client.send(request,
            HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
