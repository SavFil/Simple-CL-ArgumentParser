public class App {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ArgumentList argList = new ArgumentList();
        Parser parser = new Parser();
        
       argList.add(new Argument('i', "input", "Something about input", true));
       argList.add(new Argument('o', "output", "Something about output", true));
       argList.add(new Argument('o', "output1", "Something about output1", true));
       argList.add(new Argument('q', "output", "Something about output1", true));
       argList.add(new Argument('i', "test", "Something about output1", true));
       argList.add(new Argument('t', "test", "Something about output1", true));
       argList.show();
        
        try{
            System.out.println("Found " + parser.parse(argList, args));
        }catch(Exception e){
            System.out.print(e);
        }
        
    }
}
