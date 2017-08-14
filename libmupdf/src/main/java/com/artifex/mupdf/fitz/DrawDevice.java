package com.artifex.mupdf.fitz;

@SuppressWarnings("JniMissingFunction")
public final class DrawDevice extends NativeDevice
{
	private static native long newNative(Pixmap pixmap);

	public DrawDevice(Pixmap pixmap) {
		super(newNative(pixmap));
	}
}
