import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    ArrayList<String> ans = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "Strings: " + ans.toString();
        } else if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");

            if (parameters[0].equals("s")) {
                ans.add(parameters[1]);

                return parameters[1] + " has been added to the list!";
            }
        } else if (url.getPath().contains("/search")) {
            String substr = "";
            ArrayList<String> subAns = new ArrayList<String>();
            String[] parameters = url.getQuery().split("=");

            if (parameters[0].equals("s")) {
                substr = parameters[1];

                for (String s : ans) {
                    if (s.contains(substr)) {
                        subAns.add(s);
                    }
                }

                return subAns.toString();
            }

        }

        return "404 Not Found!";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
