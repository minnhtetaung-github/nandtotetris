public class notgate {

    int ina;
    int result;

    void out(){

        nandgate nandgate1 = new nandgate();
        nandgate1.ina = ina;
        nandgate1.inb = ina;
        nandgate1.out();
        result = nandgate1.result;
    }
}
