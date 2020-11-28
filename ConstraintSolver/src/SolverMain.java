
public class SolverMain{
    
    public static void main(String[] args) {
        
        if(args.length < 2) {
            System.out.println("Please enter arguments in the following order: java SolverMain <filename.csp> <Forward/ MAC> OPTIONAL(<Ascending / Domain>)");
            return;
        }
        
        String filePath = args[0];
        Solver solver; 
        
        if(args[1].toUpperCase().equals("FORWARD")){
            System.out.println("Creating a Forward solver");
            solver = new ForwardSolver(filePath);
            if(args.length > 2 && args[2].toUpperCase().equals(Solver.ORDERING_SMALLEST_DOMAIN)) {
                solver.setHeuristic(Solver.ORDERING_SMALLEST_DOMAIN);
            }
            else {
                solver.setHeuristic(Solver.ORDERING_ASCENDING);
            }
            solver.run();
            
        }
        
        if(args[1].toUpperCase().equals("MAC")) {
            System.out.println("Creating a MAC solver");
            solver = new MACSolver(filePath);
            if(args.length > 2 && args[2].toUpperCase().equals(Solver.ORDERING_SMALLEST_DOMAIN)) {
                solver.setHeuristic(Solver.ORDERING_SMALLEST_DOMAIN);
            }
            else {
                solver.setHeuristic(Solver.ORDERING_ASCENDING);
            }
            solver.run();
        }
       
        
        return;
    }
    
    
    
    
    
    
    

}
