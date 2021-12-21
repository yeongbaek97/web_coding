package com.mz.pj.dataroom;

import java.util.List;

public interface DataroomMapper {

	public List<DataroomFile> get();

	public int upload(DataroomFile df);

	public int delete(DataroomFile df);

}
