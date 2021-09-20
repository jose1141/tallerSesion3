package clientAPI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public abstract class Request {
    Client client= ClientBuilder.newBuilder().build();
    public abstract ResposeInfo send (String url, String body);

}
