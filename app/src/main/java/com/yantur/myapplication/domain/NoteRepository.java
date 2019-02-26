package com.yantur.myapplication.domain;

import java.util.List;

public interface NoteRepository {
	long insertNote(Note note);
	Note getNote(long id);
	List<Note> getAllNotes();
}
