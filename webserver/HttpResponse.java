public class HttpResponse {
    private String cookie;
    private String responce;
    private String status;

    public HttpResponse(){
        cookie = "";
        responce = "";
        status = "";
    }

    public void cookie(String cookie){
        this.cookie = cookie;
    }

    public void responce(String response){
        this.responce = response;
    }

    public void status(String status){
        this.status = status;
    }
    
    public void send()
}
