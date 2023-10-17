import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String ans = "";
    int sequ = 1;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return ans;
        } else if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");

            if (parameters[0].equals("s")) {
                parameters = parameters[1].split("[+]");

                if (sequ == 1) {
                    ans += sequ + ". ";
                } else {
                    ans += "\n" + sequ + ". ";
                }

                for (int i = 0; i < parameters.length - 1; i++) {
                    ans += parameters[i] + " ";
                }

                ans += parameters[parameters.length - 1];
                sequ++;        

                return ans;
            }
        }

        return "404 Not Found!";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
