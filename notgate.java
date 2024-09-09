class notgate {
    
    static int ina;
    static int result;

    static int out(){

        nandgate nandgate1 = new nandgate();
        nandgate1.ina = ina;
        nandgate1.inb = ina;
        result = nandgate1.out();

        return result;
    }
}
