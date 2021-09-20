package clientAPI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestGET extends Request{
    @Override
    public ResposeInfo send(String url, String body) {
        System.out.println("Request");
        System.out.println("URL: "+url);
        Response response=this.client.target(url).request(MediaType.APPLICATION_JSON_TYPE).get();
        ResposeInfo resposeInfo =new ResposeInfo();
        resposeInfo.setBody(response.readEntity(String.class));
        resposeInfo.setCode(String.valueOf(response.getStatus()));
        System.out.println("Response, Body: "+resposeInfo.getBody());
        System.out.println("Response, Code: "+resposeInfo.getCode());
        response.close();
        return resposeInfo;
    }
}
