public class norgate {

    int ina;
    int inb;
    int orout;
    int result;

    void out(){

        orgate orgate1 = new orgate();
        orgate1.ina = ina;
        orgate1.inb = inb;
        orgate1.out();
        orout = orgate1.result;

        notgate notgate1 = new notgate();
        notgate1.ina = orout;
        notgate1.out();
        result = orgate1.result;

    }
}
