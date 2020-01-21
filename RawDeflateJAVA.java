DeflaterOutputStream def = null;
String compressed = null;
try {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    // create deflater without header
    def = new DeflaterOutputStream(out, new Deflater(Deflater.BEST_COMPRESSION, true));
    def.write("aaaa".getBytes());
    def.close();
    compressed = new String(out.toByteArray());
} catch(Exception e) {

}
