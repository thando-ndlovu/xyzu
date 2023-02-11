package com.xyclonedesigns.xyzu;


public class exoplayerservice_ServiceBinder
	extends android.os.Binder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Player.Exoplayer.ExoPlayerService+ServiceBinder, Xyzu.Exoplayer", exoplayerservice_ServiceBinder.class, __md_methods);
	}


	public exoplayerservice_ServiceBinder ()
	{
		super ();
		if (getClass () == exoplayerservice_ServiceBinder.class)
			mono.android.TypeManager.Activate ("Xyzu.Player.Exoplayer.ExoPlayerService+ServiceBinder, Xyzu.Exoplayer", "", this, new java.lang.Object[] {  });
	}


	public exoplayerservice_ServiceBinder (java.lang.String p0)
	{
		super (p0);
		if (getClass () == exoplayerservice_ServiceBinder.class)
			mono.android.TypeManager.Activate ("Xyzu.Player.Exoplayer.ExoPlayerService+ServiceBinder, Xyzu.Exoplayer", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}

	public exoplayerservice_ServiceBinder (com.xyclonedesigns.xyzu.exoplayerservice p0)
	{
		super ();
		if (getClass () == exoplayerservice_ServiceBinder.class)
			mono.android.TypeManager.Activate ("Xyzu.Player.Exoplayer.ExoPlayerService+ServiceBinder, Xyzu.Exoplayer", "Xyzu.Player.Exoplayer.ExoPlayerService, Xyzu.Exoplayer", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
