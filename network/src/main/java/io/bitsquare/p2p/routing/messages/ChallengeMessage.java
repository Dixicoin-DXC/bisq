package io.bitsquare.p2p.routing.messages;

import io.bitsquare.app.Version;
import io.bitsquare.p2p.Address;

public final class ChallengeMessage implements AuthenticationMessage {
    // That object is sent over the wire, so we need to take care of version compatibility.
    private static final long serialVersionUID = Version.NETWORK_PROTOCOL_VERSION;

    public final Address address;
    public final int requesterNonce;
    public final int challengerNonce;

    public ChallengeMessage(Address address, int requesterNonce, int challengerNonce) {
        this.address = address;
        this.requesterNonce = requesterNonce;
        this.challengerNonce = challengerNonce;
    }

    @Override
    public String toString() {
        return "ChallengeMessage{" +
                "address=" + address +
                ", requesterNonce=" + requesterNonce +
                ", challengerNonce=" + challengerNonce +
                '}';
    }
}