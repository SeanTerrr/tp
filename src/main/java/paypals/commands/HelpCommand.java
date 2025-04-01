package paypals.commands;

import paypals.util.UI;
import paypals.ActivityManager;

public class HelpCommand extends Command{

    public HelpCommand(String command) {
        super(command);
    }

    @Override
    public void execute(ActivityManager activityManager, boolean enablePrint) {
        UI ui = new UI(enablePrint);
        ui.print("""
                Help - Available Commands:
                
                Commands with format:
                  1. add        -> add d/DESCRIPTION n/PAYER f/FRIEND1 a/AMOUNT_1 f/FRIEND2 a/AMOUNT_2...
                  2. addequal   -> addequal d/DESCRIPTION n/PAYER f/FRIEND1 f/FRIEND2 ... a/AMOUNT
                  3. delete     -> delete i/IDENTIFIER
                  4. paid       -> paid n/NAME i/IDENTIFIER
                  5. unpaid     -> unpaid n/NAME i/IDENTIFIER
                  6. edit       -> (Description) edit i/IDENTIFIER d/NEWDESCRIPTION
                                -> (Payer name) edit i/IDENTIFIER n/NEWNAME
                                -> (Friend name) edit i/IDENTIFIER f/NEWNAME o/OLDNAME
                                -> (Friend amount) edit i/IDENTIFIER a/NEWAMOUNT o/FRIENDNAME
                
                Commands without format:
                  1. list
                  2. split
                  3. help
                  4. exit
                  5. change
                  
                For more details, please refer to the User Guide of PayPals.
                """);
    }
}
