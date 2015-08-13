public class Client {  
    public static void main(String[] args) {  
        int status = 0;  
        Ice.Communicator ic = null;  
        try {  
            ic = Ice.Util.initialize(args);  
            Ice.ObjectPrx base = ic  
            .stringToProxy("TestAdapter:default -p 10000");  
            testPrx test = testPrxHelper.checkedCast(base);  
            if (test == null)  
                throw new Error("Invalid proxy");  
            System.out.println(test.execute("My first Ice ", "demo"));  
        } catch (Ice.LocalException e) {  
            e.printStackTrace();  
            status = 1;  
        } catch (Exception e) {  
            System.err.println(e.getMessage());  
            status = 1;  
        }  
        if (ic != null) {  
            try {  
                ic.destroy();  
            } catch (Exception e) {  
                System.err.println(e.getMessage());  
                status = 1;  
            }  
        }  
        System.exit(status);  
    }  
}  
