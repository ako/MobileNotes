// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Image extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "System.Image";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Image(IContext context)
	{
		this(context, Core.instantiate(context, "System.Image"));
	}

	protected Image(IContext context, IMendixObject imageMendixObject)
	{
		super(context, imageMendixObject);
		if (!Core.isSubClassOf("System.Image", imageMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a System.Image");
	}

	/**
	 * @deprecated Use 'Image.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static system.proxies.Image initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return system.proxies.Image.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static system.proxies.Image initialize(IContext context, IMendixObject mendixObject)
	{
		if (Core.isSubClassOf("MobileNotes.Images", mendixObject.getType()))
			return mobilenotes.proxies.Images.initialize(context, mendixObject);

		return new system.proxies.Image(context, mendixObject);
	}

	public static system.proxies.Image load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return system.proxies.Image.initialize(context, mendixObject);
	}

	public static java.util.List<? extends system.proxies.Image> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<system.proxies.Image> result = new java.util.ArrayList<system.proxies.Image>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//System.Image" + xpathConstraint))
			result.add(system.proxies.Image.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of PublicThumbnailPath
	 */
	public final String getPublicThumbnailPath()
	{
		return getPublicThumbnailPath(getContext());
	}

	/**
	 * @param context
	 * @return value of PublicThumbnailPath
	 */
	public final String getPublicThumbnailPath(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.PublicThumbnailPath.toString());
	}

	/**
	 * Set value of PublicThumbnailPath
	 * @param publicthumbnailpath
	 */
	public final void setPublicThumbnailPath(String publicthumbnailpath)
	{
		setPublicThumbnailPath(getContext(), publicthumbnailpath);
	}

	/**
	 * Set value of PublicThumbnailPath
	 * @param context
	 * @param publicthumbnailpath
	 */
	public final void setPublicThumbnailPath(IContext context, String publicthumbnailpath)
	{
		getMendixObject().setValue(context, MemberNames.PublicThumbnailPath.toString(), publicthumbnailpath);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.Image that = (system.proxies.Image) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "System.Image";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
