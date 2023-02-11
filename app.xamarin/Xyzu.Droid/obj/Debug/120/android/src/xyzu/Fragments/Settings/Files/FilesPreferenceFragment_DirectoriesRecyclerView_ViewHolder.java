package Xyzu.Fragments.Settings.Files;


public class FilesPreferenceFragment_DirectoriesRecyclerView_ViewHolder
	extends xyzu.widgets.recyclerviews.RecursiveItemsRecyclerView_ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Fragments.Settings.Files.FilesPreferenceFragment+DirectoriesRecyclerView+ViewHolder, Xyzu.Droid", FilesPreferenceFragment_DirectoriesRecyclerView_ViewHolder.class, __md_methods);
	}


	public FilesPreferenceFragment_DirectoriesRecyclerView_ViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == FilesPreferenceFragment_DirectoriesRecyclerView_ViewHolder.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Settings.Files.FilesPreferenceFragment+DirectoriesRecyclerView+ViewHolder, Xyzu.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
