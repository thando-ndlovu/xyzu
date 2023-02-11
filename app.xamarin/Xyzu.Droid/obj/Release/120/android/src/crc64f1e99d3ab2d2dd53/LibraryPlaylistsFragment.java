package crc64f1e99d3ab2d2dd53;


public class LibraryPlaylistsFragment
	extends crc64f1e99d3ab2d2dd53.LibraryFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onDestroyView:()V:GetOnDestroyViewHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Fragments.Library.LibraryPlaylistsFragment, Xyzu.Droid", LibraryPlaylistsFragment.class, __md_methods);
	}


	public LibraryPlaylistsFragment ()
	{
		super ();
		if (getClass () == LibraryPlaylistsFragment.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Library.LibraryPlaylistsFragment, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public LibraryPlaylistsFragment (int p0)
	{
		super (p0);
		if (getClass () == LibraryPlaylistsFragment.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Library.LibraryPlaylistsFragment, Xyzu.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onDestroyView ()
	{
		n_onDestroyView ();
	}

	private native void n_onDestroyView ();

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
