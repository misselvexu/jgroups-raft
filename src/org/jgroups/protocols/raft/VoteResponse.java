package org.jgroups.protocols.raft;

import org.jgroups.Header;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.function.Supplier;

/**
 * @author Bela Ban
 * @since  0.1
 */
public class VoteResponse extends RaftHeader {
    protected boolean result;

    public VoteResponse() {}
    public VoteResponse(int term, boolean result) {super(term); this.result=result;}

    public short getMagicId() {
        return ELECTION.VOTE_RSP;
    }

    public Supplier<? extends Header> create() {
        return VoteResponse::new;
    }

    public int serializedSize() {
        return super.serializedSize();
    }

    public void readFrom(DataInput in) throws Exception {
        super.readFrom(in);
    }

    public void writeTo(DataOutput out) throws Exception {
        super.writeTo(out);
    }

    public String toString() {
        return super.toString() + ", result=" + result;
    }
}
