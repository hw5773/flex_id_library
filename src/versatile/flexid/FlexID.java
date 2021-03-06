package versatile.flexid;

public class FlexID implements FlexIDInterface {
    private static final String TAG = "FogOSFlexID";
    private byte[] identity;         // The hash value of the public key
    private byte[] priv;             // The private key corresponding to the above public key
    private FlexIDType type;          // The type of Flex ID
    private AttrValuePairs avps;      // The attribute-value pairs of Flex ID
    private Locator loc;              // The locator

    public FlexID() {

    }

    public FlexID(String id) {
        //System.out.println("Identity in String: " + id);
        identity = id.getBytes();
        //System.out.println("Identity in byte[]: " + new String(identity));
        priv = null;
        type = FlexIDType.ANY;
        avps = new AttrValuePairs();
        loc = null;
    }

    public FlexID(byte[] identity, FlexIDType type, AttrValuePairs avps, Locator loc) {
        this.identity = identity;
        this.type = type;
        this.avps = avps;
        this.loc = loc;
        this.priv = null;
    }

    // TODO: Should implement this function
    public static FlexID generateDeviceID() {
        return new FlexID();
    }

    public byte[] getIdentity() {
        return identity;
    }

    public void setIdentity(byte[] identity) {
        this.identity = identity;
    }

    public FlexIDType getType() {
        return type;
    }

    public void setType(FlexIDType type) {
        this.type = type;
    }

    public AttrValuePairs getAvps() {
        return avps;
    }

    public void setAvps(AttrValuePairs avps) {
        this.avps = avps;
    }

    public void setLocator(Locator loc) {
        this.loc = loc;
    }

    @Override
    public String getValueByAttr(String attr) {
        return null;
    }

    @Override
    public Locator getLocator() {
        return loc;
    }

    @Override
    public void updateLocator(Locator loc) {

    }

    public byte[] getPriv() {
        return priv;
    }

    public void setPriv(byte[] priv) {
        this.priv = priv;
    }
}
