package crc643fc557b3f25824f3;


public class XyzuPlayer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.ServiceConnection
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onServiceConnected:(Landroid/content/ComponentName;Landroid/os/IBinder;)V:GetOnServiceConnected_Landroid_content_ComponentName_Landroid_os_IBinder_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onServiceDisconnected:(Landroid/content/ComponentName;)V:GetOnServiceDisconnected_Landroid_content_ComponentName_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onBindingDied:(Landroid/content/ComponentName;)V:GetOnBindingDied_Landroid_content_ComponentName_Handler:Android.Content.IServiceConnection, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onNullBinding:(Landroid/content/ComponentName;)V:GetOnNullBinding_Landroid_content_ComponentName_Handler:Android.Content.IServiceConnection, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xyzu.XyzuPlayer, Xyzu.Droid", XyzuPlayer.class, __md_methods);
	}


	public XyzuPlayer ()
	{
		super ();
		if (getClass () == XyzuPlayer.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuPlayer, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}

	public XyzuPlayer (android.content.Context p0)
	{
		super ();
		if (getClass () == XyzuPlayer.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuPlayer, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1)
	{
		n_onServiceConnected (p0, p1);
	}

	private native void n_onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1);


	public void onServiceDisconnected (android.content.ComponentName p0)
	{
		n_onServiceDisconnected (p0);
	}

	private native void n_onServiceDisconnected (android.content.ComponentName p0);


	public void onBindingDied (android.content.ComponentName p0)
	{
		n_onBindingDied (p0);
	}

	private native void n_onBindingDied (android.content.ComponentName p0);


	public void onNullBinding (android.content.ComponentName p0)
	{
		n_onNullBinding (p0);
	}

	private native void n_onNullBinding (android.content.ComponentName p0);

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
