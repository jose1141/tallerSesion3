package clientAPI;

public class FactoryRequest {
    public static Request make(String type){
        Request request;
        switch (type.toLowerCase()){
            case "get":
                request= new RequestGET();
                break;
            case "post":
                request= new RequestPOST();
                break;
            case "delete":
                request= new RequestDELETE();
                break;
            default:
                request= new RequestGET();
                break;
        }
        return request;
    }
}
