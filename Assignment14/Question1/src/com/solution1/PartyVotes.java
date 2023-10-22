package com.solution1;

public class PartyVotes {
String party;
int votes;
public PartyVotes() {
	this("BJP",0);
}
public PartyVotes(String party, int votes) {
	super();
	this.party = party;
	this.votes = votes;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
@Override
public String toString() {
	return "PartyVotes [party=" + party + ", votes=" + votes + "]";
}


}
