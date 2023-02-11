package mono.jp.co.cyberagent.android.gpuimage;


public class GPUImageView_OnPictureSavedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		jp.co.cyberagent.android.gpuimage.GPUImageView.OnPictureSavedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPictureSaved:(Landroid/net/Uri;)V:GetOnPictureSaved_Landroid_net_Uri_Handler:JP.CyberAgent.GpuImageLib.GPUImageView/IOnPictureSavedListenerInvoker, CyberAgentGpuImageLibrary\n" +
			"";
		mono.android.Runtime.register ("JP.CyberAgent.GpuImageLib.GPUImageView+IOnPictureSavedListenerImplementor, CyberAgentGpuImageLibrary", GPUImageView_OnPictureSavedListenerImplementor.class, __md_methods);
	}


	public GPUImageView_OnPictureSavedListenerImplementor ()
	{
		super ();
		if (getClass () == GPUImageView_OnPictureSavedListenerImplementor.class)
			mono.android.TypeManager.Activate ("JP.CyberAgent.GpuImageLib.GPUImageView+IOnPictureSavedListenerImplementor, CyberAgentGpuImageLibrary", "", this, new java.lang.Object[] {  });
	}


	public void onPictureSaved (android.net.Uri p0)
	{
		n_onPictureSaved (p0);
	}

	private native void n_onPictureSaved (android.net.Uri p0);

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
