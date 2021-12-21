package com.mz.pj.gallery;

import java.util.List;

public interface GalleryMapper {

	public List<GalleryFile> get();

	public int upload(GalleryFile gf);

	public int delete(GalleryFile gf);

}
