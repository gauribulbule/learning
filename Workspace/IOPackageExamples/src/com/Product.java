package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Product implements Externalizable{
private int pid;
private String pname;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + "]";
}
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	// TODO Auto-generated method stub
	out.writeInt(pid);
	out.writeUTF(pname);
	
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	pid = in.readInt();
	pname = in.readUTF();
}



}

