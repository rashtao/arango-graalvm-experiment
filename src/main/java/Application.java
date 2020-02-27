import com.arangodb.ArangoDB;
import com.arangodb.velocystream.Request;
import com.arangodb.velocystream.RequestType;
import com.arangodb.velocystream.Response;

import java.util.Date;

/**
 * @author Michele Rastelli
 */
public class Application {
    private static Request versionRequest = new Request("_system", RequestType.GET, "/_api/version");

    public static void main(String[] args) {
        long start = new Date().getTime();
        System.out.println("hi " + new Date());

        ArangoDB arango = new ArangoDB.Builder().password("test").build();
        Response res = arango.execute(versionRequest);
        System.out.println(res.getBody());

        String version = arango.getVersion().getVersion();
        System.out.println(version);

        long end = new Date().getTime();
        System.out.println("elapsed time [ms]: " + (end - start));

        arango.shutdown();
    }
}
