import java.util.*;

public class gatechecker {

    public static void main(String[] args) {

        String choose;

        int ina;
        int inb;
        int inc;
        int ind;

        int ina16[] = new int[16];
        int inb16[] = new int[16];
        int inc16[] = new int[16];
        int ind16[] = new int[16];

        int ina8[] = new int[16];
        int inb8[] = new int[16];

        int sel1;
        int sel2;
        int sel3;
        int sel4;

        int func[] = new int[6];

        int result1;
        int result2;
        int result3;
        int result4;

        int result8[] = new int[8];
        int result16[] = new int[16];

        int sum;
        int carry;

        int i;

        System.out.println("Choose one.");
        System.out.println("nand, not, and, or, nor, xor, xnor, and16, demux, demux4, demux8, mux, mux16, mux4way16, not16, or8, halfadder, fulladder, add16, inc16, alu");
        Scanner choosein = new Scanner(System.in);
        choose = choosein.nextLine();

        switch(choose){

            default:
                System.out.println("Invalid input.");
                break;

                case "nand":
                    System.out.println("Enter input a.");
                    Scanner nandina = new Scanner(System.in);
                    ina = nandina.nextInt();

                    System.out.println("Enter input b.");
                    Scanner nandinb = new Scanner(System.in);
                    inb = nandinb.nextInt();

                    nandgate nandgate1 = new nandgate();
                    nandgate1.ina = ina;
                    nandgate1.inb = inb;
                    nandgate1.out();
                    result1 = nandgate1.result;

                    System.out.println("Output is " + result1  + ".");
                    break;

            case "not":

                System.out.println("Enter input a.");
                Scanner notgate = new Scanner(System.in);
                ina = notgate.nextInt();

                notgate notgate1 = new notgate();
                notgate1.ina = ina;
                notgate1.out();
                result1 = notgate1.result;

                System.out.println("Output is " + result1 + ".");
                break;

            case "and":

                System.out.println("Enter input a.");
                Scanner andgateina = new Scanner(System.in);
                ina = andgateina.nextInt();

                System.out.println("Enter input b.");
                Scanner andgateinb = new Scanner(System.in);
                inb = andgateinb.nextInt();

                andgate andgate1 = new andgate();
                andgate1.ina = ina;
                andgate1.inb = inb;
                andgate1.out();
                result1 = andgate1.result;

                System.out.println("Output is " + result1  + ".");
                break;

            case "or":

                System.out.println("Enter input a.");
                Scanner orina = new Scanner(System.in);
                ina = orina.nextInt();

                System.out.println("Enter input b.");
                Scanner orinb = new Scanner(System.in);
                inb = orinb.nextInt();

                orgate orgate1 = new orgate();
                orgate1.ina = ina;
                orgate1.inb = inb;
                orgate1.out();
                result1 = orgate1.result;

                System.out.println("Output is " + result1  + ".");
                break;

            case "nor":

                System.out.println("Enter input a.");
                Scanner norina = new Scanner(System.in);
                ina = norina.nextInt();

                System.out.println("Enter input b.");
                Scanner norinb = new Scanner(System.in);
                inb = norinb.nextInt();

                norgate norgate1 = new norgate();
                norgate1.ina = ina;
                norgate1.inb = inb;
                norgate1.out();
                result1 = norgate1.result;

                System.out.println("Output is " + result1  + ".");
                break;

            case "xor":

                System.out.println("Enter input a.");
                Scanner xorina = new Scanner(System.in);
                ina = xorina.nextInt();

                System.out.println("Enter input b.");
                Scanner xorinb = new Scanner(System.in);
                inb = xorinb.nextInt();

                xorgate xorgate1 = new xorgate();
                xorgate1.ina = ina;
                xorgate1.inb = inb;
                xorgate1.out();
                result1 = xorgate1.result;

                System.out.println("Output is " + result1  + ".");
                break;

            case "xnor":

                System.out.println("Enter input a.");
                Scanner xnorina = new Scanner(System.in);
                ina = xnorina.nextInt();

                System.out.println("Enter input b.");
                Scanner xnorinb = new Scanner(System.in);
                inb = xnorinb.nextInt();

                xnorgate xnorgate1 = new xnorgate();
                xnorgate1.ina = ina;
                xnorgate1.inb = inb;
                xnorgate1.out();
                result1 = xnorgate1.result;

                System.out.println("Output is " + result1  + ".");
                break;

            case "and16":

                System.out.println("Enter input a.");
                for(i = 0; i < 16; i++){
                    Scanner and16ina = new Scanner(System.in);
                    ina16[i] = and16ina.nextInt();
                }

                System.out.println("Enter input b.");
                for(i = 0; i < 16; i++){
                    Scanner and16inb = new Scanner(System.in);
                    inb16[i] = and16inb.nextInt();
                }

                and16 and161 = new and16();
                and161.ina16 = ina16;
                and161.inb16 = inb16;
                and161.out();
                result16 = and161.result16;

                System.out.print("Output is ");
                for( i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }
                break;

            case "demux":

                System.out.println("Enter input a.");
                Scanner demux = new Scanner(System.in);
                ina = demux.nextInt();

                System.out.println("Enter sel.");
                Scanner demuxsel = new Scanner(System.in);
                sel1 = demuxsel.nextInt();

                demux demux1 = new demux();
                demux1.ina = ina;
                demux1.sel = sel1;
                demux1.out();
                result1 = demux1.result1;
                result2 = demux1.result2;

                System.out.println("Result1 is " + result1  + ".");
                System.out.println("Result2 is " + result2  + ".");
                break;

            case "demux4":

                System.out.println("Enter input a.");
                Scanner demux4ina = new Scanner(System.in);
                ina = demux4ina.nextInt();

                System.out.println("Enter sel1.");
                Scanner demuxsel1 = new Scanner(System.in);
                sel1 = demuxsel1.nextInt();

                System.out.println("Enter sel2.");
                Scanner demuxsel2 = new Scanner(System.in);
                sel2 = demuxsel2.nextInt();

                demux4 demux41 = new demux4();
                demux41.ina = ina;
                demux41.sel1 = sel1;
                demux41.sel2 = sel2;
                demux41.out();
                result1 = demux41.result1;
                result2 = demux41.result2;
                result3 = demux41.result3;
                result4 = demux41.result4;

                System.out.println("Result1 is " + result1  + ".");
                System.out.println("Result2 is " + result2  + ".");
                System.out.println("Result3 is " + result3  + ".");
                System.out.println("Result4 is " + result4  + ".");
                break;

            case "demux8":

                System.out.println("Enter input a.");
                Scanner demux8ina = new Scanner(System.in);
                ina = demux8ina.nextInt();

                System.out.println("Enter sel1.");
                Scanner demux8sel1 = new Scanner(System.in);
                sel1 = demux8sel1.nextInt();

                System.out.println("Enter sel2.");
                Scanner demux8sel2 = new Scanner(System.in);
                sel2 = demux8sel2.nextInt();

                System.out.println("Enter sel3.");
                Scanner demux8sel3 = new Scanner(System.in);
                sel3 = demux8sel3.nextInt();

                demux8 demux81 = new demux8();
                demux81.ina = ina;
                demux81.sel1 = sel1;
                demux81.sel2 = sel2;
                demux81.sel3 = sel3;
                demux81.out();
                result8 = demux81.result;

                System.out.println("Result is ");
                for( i = 0; i < 8; i++){
                    System.out.print(result8[i]);
                }
                break;

            case "mux":

                System.out.println("Enter input a.");
                Scanner muxina = new Scanner(System.in);
                ina = muxina.nextInt();

                System.out.println("Enter input b");
                Scanner muxinba = new Scanner(System.in);
                inb = muxinba.nextInt();

                System.out.println("Enter sel1.");
                Scanner muxsel1 = new Scanner(System.in);
                sel1 = muxsel1.nextInt();

                mux mux1 = new mux();
                mux1.ina = ina;
                mux1.inb = inb;
                mux1.sel = sel1;
                mux1.out();
                result1 = mux1.result;

                System.out.println("Result1 is " + result1  + ".");

            case "mux16":

                System.out.println("Enter input a.");
                for(i = 0; i < 16; i++){
                    Scanner mux16ina = new Scanner(System.in);
                    ina16[i] = mux16ina.nextInt();
                }

                System.out.println("Enter input b.");
                for(i = 0; i < 16; i++){
                    Scanner mux161inb = new Scanner(System.in);
                    inb16[i] = mux161inb.nextInt();
                }

                System.out.println("Enter sel1.");
                Scanner mux16sel = new Scanner(System.in);
                sel1 = mux16sel.nextInt();

                mux16 mux161 = new mux16();
                mux161.ina16 = ina16;
                mux161.inb16 = inb16;
                mux161.sel = sel1;
                mux161.out();
                result16 = mux161.result16;

                System.out.println("Result1 is ");
                for( i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }
                break;

            case "mux4way16":

                System.out.println("Enter input a.");
                Scanner mux4way16ina = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    ina16[i] = mux4way16ina.nextInt();
                }

                System.out.println("Enter input b.");
                Scanner mux4way16inb = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    inb16[i] = mux4way16ina.nextInt();
                }

                System.out.println("Enter input c.");
                Scanner mux4way16sel = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    inc16[i] = mux4way16inb.nextInt();
                }

                System.out.println("Enter input d.");
                Scanner mux4way16sel2 = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    ind16[i] = mux4way16sel.nextInt();
                }

                System.out.println("Enter sel1.");
                Scanner mux4waysel1 = new Scanner(System.in);
                sel1 = mux4waysel1.nextInt();

                System.out.println("Enter sel2.");
                Scanner mux4waysel2 = new Scanner(System.in);
                sel2 = mux4waysel2.nextInt();

                mux4way16 demux4way1 = new mux4way16();
                demux4way1.ina16 = ina16;
                demux4way1.inb16 = inb16;
                demux4way1.inc16 = inc16;
                demux4way1.ind16 = ind16;
                demux4way1.sel1 = sel1;
                demux4way1.sel2 = sel2;
                demux4way1.out();
                result16 = demux4way1.result16;

                System.out.println("Result1 is ");
                for( i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }
                break;

            case "not16":

                System.out.println("Enter input a.");
                Scanner not16ina = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    ina16[i] = not16ina.nextInt();
                }

                not16 not161 = new not16();
                not161.ina16 = ina16;
                not161.out();
                result16 = not161.result16;

                System.out.println("Result1 is ");
                for( i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }
                break;

            case "or8":

                System.out.println("Enter input a.");
                Scanner or8ina = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    ina8[i] = or8ina.nextInt();
                }

                or8 or81 = new or8();
                or81.ina8 = ina8;
                or81.out();
                result1 = or81.result;

                System.out.println("Result1 is " + result1  + ".");
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
                sum = halfadder1.sum;
                carry = halfadder1.carry;

                System.out.println("The sum is " + sum + ".");
                System.out.println("The carry is " + carry + ".");
                break;

            case "add16":

                System.out.println("Enter input a.");
                Scanner add16ina = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    ina16[i] = add16ina.nextInt();
                }

                System.out.println("Enter input b.");
                Scanner add16inb = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    inb16[i] = add16inb.nextInt();
                }

                add16 add161 = new add16();
                add161.ina16 = ina16;
                add161.inb16 = inb16;
                add161.out();
                result16 = add161.sum;

                System.out.println("Result1 is ");
                for( i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }
                break;

            case "inc16":

                System.out.println("Enter input a.");
                Scanner inc16ina = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    inc16[i] = inc16ina.nextInt();
                }

                inc16 inc161 = new inc16();
                inc161.ina16 = ina16;
                inc161.out();
                result16 = inc161.result16;

                System.out.println("Result1 is ");
                for( i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }
                break;

            case "alu":

                System.out.println("Enter input ina.");
                Scanner aluina = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    ina16[i] = aluina.nextInt();
                }

                System.out.println("Enter input b.");
                Scanner aluinb = new Scanner(System.in);
                for(i = 0; i < 16; i++){
                    inb16[i] = aluinb.nextInt();
                }

                System.out.println("Enter function.");
                Scanner alufunc = new Scanner(System.in);
                for(i = 0; i < 6; i++){
                    func[i] = alufunc.nextInt();
                }

                alu alu1 = new alu();
                alu1.ina16 = ina16;
                alu1.inb16 = inb16;
                alu1.func6 = func;
                alu1.out();
                result16 = alu1.result16;

                System.out.println("Result1 is ");
                for( i = 0; i < 16; i++){
                    System.out.print(result16[i]);
                }
                break;
        }
    }
}
