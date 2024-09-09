import java.util.Scanner;


public class gatechecker {
    
    public static void main(String[] args) {

        String choose;
        
        int ina;
        int inb;
        int inc;
        int ind;

        int in16[] = new int[16];
        int ina16[] = new int[16];
        int inb16[] = new int[16];
        int inc16[] = new int[16];
        int ind16[] = new int[16];
        
        int ina8[] = new int[8];
        int inb8[] = new int[8];

        int result;
        int result1;
        int result2;
        int result3;
        int result4;

        int result8[] = new int[8];
        int result16[] = new int[16];
        
        int sel;
        int sel1;
        int sel2;
        int sel3;
        int sel4;
        int alufunc[] = new int[6];

        int ng;
        int zr;

        System.out.println("Choose one.");
        Scanner choosein = new Scanner(System.in);
        choose = choosein.nextLine();

        switch(choose){
            case "nand":
            
            System.out.println("Enter input a.");
            Scanner innanda = new Scanner(System.in);
            ina = innanda.nextInt(); 

            System.out.println("Enter input b.");
            Scanner innandb = new Scanner(System.in);
            inb = innandb.nextInt();

            nandgate nandgate1 = new nandgate();
            nandgate1.ina = ina;
            nandgate1.inb = inb;
            result = nandgate1.out();

            System.out.println("The result is " + result + ".");
            
            break;

            default:
                System.out.println("Wrong choose.");
                break;

            case "not":

            System.out.println("Enter input.");
            Scanner innota = new Scanner(System.in);
            ina = innota.nextInt();
            
            notgate notgate1 = new notgate();
            notgate1.ina = ina;
            result = notgate1.out();

            System.out.println("The result is " + result + ".");
            
            break;

            case "and":

            System.out.println("Enter input a.");
            Scanner inanda = new Scanner(System.in);
            ina = inanda.nextInt();
            
            System.out.println("Enter input b.");
            Scanner inandb = new Scanner(System.in);
            inb = inandb.nextInt();

            andgate andgate1 = new andgate();
            andgate1.ina = ina;
            andgate1.inb = inb;
            result = andgate1.out();

            System.out.println("The result is " + result + ".");
            
            break;

            case "or":
            
            System.out.println("Enter input a.");
            Scanner inora = new Scanner(System.in);
            ina = inora.nextInt();
            
            System.out.println("Enter input b.");
            Scanner inorb = new Scanner(System.in);
            inb = inorb.nextInt();

            orgate orgate1 = new orgate();
            orgate1.ina = ina;
            orgate1.inb = inb;
            result = orgate1.out();

            System.out.println("The result is " + result + ".");
            
            break;
           
            case "xor":
            
            System.out.println("Enter input a.");
            Scanner inxora = new Scanner(System.in);
            ina = inxora.nextInt();
            
            System.out.println("Enter input b.");
            Scanner inxorb = new Scanner(System.in);
            inb = inxorb.nextInt();

            xorgate xorgate1 = new xorgate();
            xorgate1.ina = ina;
            xorgate1.inb = inb;
            result = xorgate1.out();

            System.out.println("The result is " + result + ".");
            
            break;

            case "xnor":
            
            System.out.println("Enter input a.");
            Scanner inxnora = new Scanner(System.in);
            ina = inxnora.nextInt();
            
            System.out.println("Enter input b.");
            Scanner inxnorb = new Scanner(System.in);
            inb = inxnorb.nextInt();

            xnorgate xnorgate1 = new xnorgate();
            xnorgate1.ina = ina;
            xnorgate1.inb = inb;
            result = xnorgate1.out();

            System.out.println("The result is " + result + ".");
            
            break;

            case "nor":
            
            System.out.println("Enter input a.");
            Scanner innora = new Scanner(System.in);
            ina = innora.nextInt();
            
            System.out.println("Enter input b.");
            Scanner innorb = new Scanner(System.in);
            inb = innorb.nextInt();

            norgate norgate1 = new norgate();
            norgate1.ina = ina;
            norgate1.inb = inb;
            result = norgate1.out();

            System.out.println("The result is " + result + ".");
            
            break;

            case "mux":

            System.out.println("Enter input a.");
            Scanner inmuxa = new Scanner(System.in);
            ina = inmuxa.nextInt();

            System.out.println("Enter input b.");
            Scanner inmuxb= new Scanner(System.in);
            inb = inmuxb.nextInt();

            System.out.println("Enter select.0 or 1.(0 = a & 1 = b)");
            Scanner inmuxsel = new Scanner(System.in);
            sel = inmuxsel.nextInt();

            mux mux1 = new mux();
            mux1.ina = ina;
            mux1.inb = inb;
            mux1.sel = sel;
            result = mux1.out();

            System.out.println("The result is " + result + ".");

            break;

            case "dmux":

            System.out.println("Enter input.");
            Scanner dmuxin = new Scanner(System.in);
            ina = dmuxin.nextInt();

            System.out.println("Enter select.0 or 1.");
            Scanner dmuxsel = new Scanner(System.in);
            sel = dmuxsel.nextInt();

            dmux dmux1 = new dmux();
            dmux1.ina = ina;
            dmux1.sel = sel;
            dmux1.out();

            result1 = dmux1.result1;
            result2 = dmux1.result2;

            System.out.println("The result1 is " + result1 + ".");
            System.out.println("The result2 is " + result2 + ".");

            break;

            case "not16":
            
            System.out.println("Enter 16 numbers.");
            Scanner not16in = new Scanner(System.in);
            for(int i = 0; i <16; i++){                
                in16[i] = not16in.nextInt();
            }

            

            not16 not161 = new not16();
            not161.in16 = in16;
            not161.out();

            result16 = not161.result16; 

            System.out.println("The result is ");

            for(int j = 0; j <16; j++){
                System.out.println(result16[j]);
            }

            break;

            case "and16":

            System.out.println("Enter input a.(16 numbers)");
            Scanner and16ina = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                ina16[i] = and16ina.nextInt();
            }     

            System.out.println("Enter input b.(16 numbers)");
            Scanner and16inb = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                inb16[i] = and16inb.nextInt();
            }            

            and16 and161 = new and16();
            and161.ina16 = ina16;
            and161.inb16 = inb16;
            and161.out();

            result16 = and161.result16;

            System.out.println("The result is ");
            for(int j = 0; j <16; j++){
                System.out.println(result16[j]);
            }

            break;

            case "mux16":

            System.out.println("Enter input a.");
            Scanner inmuxa16 = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                ina16[i] = inmuxa16.nextInt();
            }

            System.out.println("Enter input b.");
            Scanner inmuxb16 = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                inb16[i] = inmuxb16.nextInt();
            }

            System.out.println("Enter select.0 or 1.(0 = a & 1 = b)");
            Scanner inmuxsel16 = new Scanner(System.in);
            sel = inmuxsel16.nextInt();

            mux16 mux161 = new mux16();
            mux161.ina16 = ina16;
            mux161.inb16 = inb16;
            mux161.sel = sel;
            mux161.out();

            result16 = mux161.result16;

            System.out.println("The result is ");
            for(int j = 0; j < 16; j++){
                System.out.println(result16[j]);        
            }

            break;

            case "or8":

            System.out.println("Enter input.");
            Scanner or8in = new Scanner(System.in);
            for (int i = 0; i < 8; i++){
                ina8[i] = or8in.nextInt();
            }

            or8 or81 = new or8();
            or81.ina8 = ina8 ;
            or81.out();

            result = or81.result;

            System.out.println("The result is " + result + ".");
            
            break;

            case "dmux4":

            System.out.println("Enter input.");
            Scanner dmux4in = new Scanner(System.in);
            ina = dmux4in.nextInt();

            System.out.println("Enter input sel1.");
            Scanner dmuxsel1 = new Scanner(System.in);
            sel1 = dmuxsel1.nextInt();

            System.out.println("Enter input sel2.");
            Scanner dmuxsel2 = new Scanner(System.in);
            sel2 = dmuxsel2.nextInt();

            dmux4 dmux41 = new dmux4();
            dmux41.ina = ina;
            dmux41.sel1 = sel1;
            dmux41.sel2 = sel2;
            dmux41.out();

            result1 = dmux41.result1;
            result2 = dmux41.result2;
            result3 = dmux41.result3;
            result4 = dmux41.result4;

            System.out.println("The result 1 is " + result1 + ".");
            System.out.println("The result 2 is " + result2 + ".");
            System.out.println("The result 3 is " + result3 + ".");
            System.out.println("The result 4 is " + result4 + ".");

            break;

            case "dmux8":

            System.out.println("Enter input.");
            Scanner dmux8in = new Scanner(System.in);
            ina = dmux8in.nextInt(); 
            
            System.out.println("Enter input sel1.");
            Scanner dmux8sel1 = new Scanner(System.in);
            sel1 = dmux8sel1.nextInt();

            System.out.println("Enter input sel2.");
            Scanner dmux8sel2 = new Scanner(System.in);
            sel2 = dmux8sel2.nextInt();

            System.out.println("Enter input sel3.");
            Scanner dmux8sel3 = new Scanner(System.in);
            sel3 = dmux8sel3.nextInt();

            dmux8 dmux81 = new dmux8();
            dmux81.ina = ina;
            dmux81.sel1 = sel1;
            dmux81.sel2 = sel3;
            dmux81.sel3 = sel2;
            dmux81.out();

            result8 = dmux81.result;

            for(int i = 0; i < 8; i++){
                System.out.println("The result " + i + " is " + result8[i] + ".");
            }

            break;

            case "mux4way16":

            System.out.println("Enter input a.(16 bits)");
            Scanner mux4way16ina = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                ina16[i] = mux4way16ina.nextInt();
            }

            System.out.println("Enter input b.(16 bits)");
            Scanner mux4way16inb = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                inb16[i] = mux4way16inb.nextInt();
            }

            System.out.println("Enter input c.(16 bits)");
            Scanner mux4way16inc = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                inc16[i] = mux4way16inc.nextInt();
            }

            System.out.println("Enter select.0 or 1.(16 bits)");
            Scanner mux4way16ind = new Scanner(System.in);
            for(int i = 0; i < 16; i++){
                ind16[i] = mux4way16ind.nextInt();
            }

            System.out.println("Enter select a.");
            Scanner mux4way16sel1 = new Scanner(System.in);
            sel1 = mux4way16sel1.nextInt();

            System.out.println("Enter select b.");
            Scanner mux4way16sel2 = new Scanner(System.in);
            sel2 = mux4way16sel2.nextInt();

            mux4way16 mux4way161 = new mux4way16();
            mux4way161.ina16 = ina16;
            mux4way161.inb16 = inb16;
            mux4way161.inc16 = inc16;
            mux4way161.ind16 = ind16;
            mux4way161.sel1 = sel1;
            mux4way161.sel2 = sel2;
            mux4way161.out();
            result16 = mux4way161.result16;

            for(int i = 0; i < 16; i++){
                System.out.println("The result " + i + " is " + result16[i] + ".");
            }

            break;

            case "halfadder":

                System.out.println("Enter input a.");
                Scanner halfadderina = new Scanner(System.in);
                ina = halfadderina.nextInt();

                System.out.println("Enter input b.");
                Scanner halfadderinb = new Scanner(System.in);
                inb = halfadderinb.nextInt();

                halfadder halfadder1 = new halfadder();
                halfadder1.ina = ina;
                halfadder1.inb = inb;
                halfadder1.out();
                result1 = halfadder1.sum;
                result2 = halfadder1.carry;

                System.out.println("The result sum is " + result1 + ".");
                System.out.println("The result carry is " + result2 + ".");

                break;

            case "fulladder":

                System.out.println("Enter input a.");
                Scanner fulladderina = new Scanner(System.in);
                ina = fulladderina.nextInt();

                System.out.println("Enter input b.");
                Scanner fulladderinb = new Scanner(System.in);
                inb = fulladderinb.nextInt();

                System.out.println("Enter input c.");
                Scanner fulladderinc = new Scanner(System.in);
                inc = fulladderinc.nextInt();

                fulladder fulladder1 = new fulladder();
                fulladder1.ina = ina;
                fulladder1.inb = inb;
                fulladder1.inc = inc;
                fulladder.out();
                result1 = fulladder1.sum;
                result2 = fulladder1.carry;

                System.out.println("The result sum is " + result1 + ".");
                System.out.println("The result carry is " + result2 + ".");

                break;

            case"add16":

                System.out.println("Enter input a.");
                for(int i = 0; i < 16; i++){
                    Scanner add16ina = new Scanner(System.in);
                    ina16[i] = add16ina.nextInt();
                }

                System.out.println("Enter input b.");
                for(int i = 0; i < 16; i++){
                    Scanner add16inb = new Scanner(System.in);
                    inb16[i] = add16inb.nextInt();
                }

                add16 add161 = new add16();
                add161.ina16 = ina16;
                add161.inb16 = inb16;
                add161.out();
                result16 = add161.sum;

                for(int i = 0; i < 16; i++){
                    System.out.println("The result " + i + " is " + result16[i] + ".");
                }

                break;

            case"inc16":

                System.out.println("Enter input a.");
                for(int i = 0; i < 16; i++){
                    Scanner inc16ina = new Scanner(System.in);
                    ina16[i] = inc16ina.nextInt();
                }

                inc16 inc161 = new inc16();
                inc161.ina16 = ina16;
                inc161.out();
                result16 = inc161.result16;

                for(int i = 0; i < 16; i++){
                    System.out.println("The result " + i + " is " + result16[i] + ".");
                }

            case"alu":

                System.out.println("Enter input a.");
                for(int i = 0; i < 16; i++){
                    Scanner alu16ina = new Scanner(System.in);
                    ina16[i] = alu16ina.nextInt();
                }

                System.out.println("Enter input b.");
                for(int i = 0; i < 16; i++){
                    Scanner aluinb = new Scanner(System.in);
                    inb16[i] = aluinb.nextInt();
                }

                System.out.println("Enter function.(6 bits)");
                for(int i = 0; i < 6; i++){
                    Scanner alu16func = new Scanner(System.in);
                    alufunc[i] = alu16func.nextInt();
                }

                alu alu1 = new alu();
                alu1.ina16 = ina16;
                alu1.inb16 = inb16;
                alu1.func16 = alufunc;
                alu1.out();
                result16 = alu1.result16;

                System.out.println("The result.");
                for(int i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }





        }

    }


}
