package com.yantur.myapplication.data;

import com.yantur.myapplication.domain.Note;
import com.yantur.myapplication.domain.NoteRepository;

import java.util.List;

public class NoteRepositoryImpl implements NoteRepository {
	//stex chem grum vonc em get create anum vortev haves chka :D kara internetov lini kara dbi call lini

	@Override
	public long insertNote(Note note) {
		return 0;
	}

	@Override
	public Note getNote(long id) {
		return null;
	}

	@Override
	public List<Note> getAllNotes() {
		return null;
	}
}
