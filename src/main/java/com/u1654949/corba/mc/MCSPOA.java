package com.u1654949.corba.mc;


/**
 * Generated from IDL interface "MCS".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at Mar 28, 2020, 11:31:38 AM
 */

public abstract class MCSPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, com.u1654949.corba.mc.MCSOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_get_name", Integer.valueOf(0));
		m_opsHash.put ( "ping", Integer.valueOf(1));
		m_opsHash.put ( "remove_tls_connection", Integer.valueOf(2));
		m_opsHash.put ( "get_County_state", Integer.valueOf(3));
		m_opsHash.put ( "get_connected_tls", Integer.valueOf(4));
		m_opsHash.put ( "get_alarms", Integer.valueOf(5));
		m_opsHash.put ( "cancel_alarm", Integer.valueOf(6));
		m_opsHash.put ( "receive_alarm", Integer.valueOf(7));
		m_opsHash.put ( "get_known_stations", Integer.valueOf(8));
		m_opsHash.put ( "register_tls_connection", Integer.valueOf(9));
	}
	private String[] ids = {"IDL:com/u1654949/corba/mc/MCS:1.0"};
	public com.u1654949.corba.mc.MCS _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		com.u1654949.corba.mc.MCS __r = com.u1654949.corba.mc.MCSHelper.narrow(__o);
		return __r;
	}
	public com.u1654949.corba.mc.MCS _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		com.u1654949.corba.mc.MCS __r = com.u1654949.corba.mc.MCSHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // _get_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult14 = name();
_out.write_string( tmpResult14 );
				break;
			}
			case 1: // ping
			{
				_out = handler.createReply();
				_out.write_boolean(ping());
				break;
			}
			case 2: // remove_tls_connection
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(remove_tls_connection(_arg0));
				break;
			}
			case 3: // get_County_state
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				com.u1654949.corba.common.AlarmsHelper.write(_out,get_County_state(_arg0));
				break;
			}
			case 4: // get_connected_tls
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				com.u1654949.corba.ls.TLSHelper.write(_out,get_connected_tls(_arg0));
				break;
			}
			case 5: // get_alarms
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				com.u1654949.corba.common.AlarmsHelper.write(_out,get_alarms(_arg0));
				break;
			}
			case 6: // cancel_alarm
			{
				com.u1654949.corba.common.TLSData _arg0=com.u1654949.corba.common.TLSDataHelper.read(_input);
				_out = handler.createReply();
				cancel_alarm(_arg0);
				break;
			}
			case 7: // receive_alarm
			{
				com.u1654949.corba.common.Alarm _arg0=com.u1654949.corba.common.AlarmHelper.read(_input);
				_out = handler.createReply();
				receive_alarm(_arg0);
				break;
			}
			case 8: // get_known_stations
			{
				_out = handler.createReply();
				com.u1654949.corba.common.TLS_ListHelper.write(_out,get_known_stations());
				break;
			}
			case 9: // register_tls_connection
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				_out.write_boolean(register_tls_connection(_arg0));
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
