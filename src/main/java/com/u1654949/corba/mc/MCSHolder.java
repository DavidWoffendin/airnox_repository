package com.u1654949.corba.mc;

/**
 * Generated from IDL interface "MCS".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 28, 2020, 11:31:38 AM
 */

public final class MCSHolder	implements org.omg.CORBA.portable.Streamable{
	 public MCS value;
	public MCSHolder()
	{
	}
	public MCSHolder (final MCS initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MCSHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MCSHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MCSHelper.write (_out,value);
	}
}
