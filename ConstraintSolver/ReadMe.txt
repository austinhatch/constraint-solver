Instructions for Compiling Solver:

1. Using your console, navigate to the src folder of the CS4402-p2 directory

2. To compile all files in the src folder use "javac *.java" in the command line

Instructions for Compiling Solver:

1. From the src folder of the CS4402-p2 directory use the command line to run using 

2. The java class SolverMain requires 2 additional arguments and an optional 3rd

java SolverMain <filename.csp> <Forward/ MAC> OPTIONAL(<Ascending / Domain>)


** <filename.csp> indicates the filepath for the .csp file relative to src. Test files can be accessed via Tests/4Queens.csp for example

**<Forward/MAC> indicates which algorithm to solve with. This is not case sensitive.

**<Ascending / domain> indicates the desire variable ordering heuristic. If not provided, will default to ascending



****Example****

java SolverMain Tests/6Queens.csp forward domain

Will run the forward checking algorith on 6Queens.csp with smallest domain variable ordering
