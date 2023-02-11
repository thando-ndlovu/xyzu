package crc644ad39f5f9ab41608;


public class CancellationSignalOnCancelListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.os.CancellationSignal.OnCancelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancel:()V:GetOnCancelHandler:AndroidX.Core.OS.CancellationSignal/IOnCancelListenerInvoker, Xamarin.AndroidX.Core\n" +
			"";
		mono.android.Runtime.register ("AndroidX.Core.OS.CancellationSignalOnCancelListener, Xyzu.Extensions", CancellationSignalOnCancelListener.class, __md_methods);
	}


	public CancellationSignalOnCancelListener ()
	{
		super ();
		if (getClass () == CancellationSignalOnCancelListener.class)
			mono.android.TypeManager.Activate ("AndroidX.Core.OS.CancellationSignalOnCancelListener, Xyzu.Extensions", "", this, new java.lang.Object[] {  });
	}


	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();

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
