package com.yantur.myapplication.presenter;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yantur.myapplication.R;
import com.yantur.myapplication.domain.Note;

public class MainActivity extends AppCompatActivity {

	private NoteViewModel noteViewModel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		noteViewModel = ViewModelProviders.of(this).get(NoteViewModel.class);

		noteViewModel.noteCreation().observe(this, noteId -> {
			//stex galisa create exac note-i id-in
		});
		noteViewModel.note().observe(this, note -> {
			//stex galisa get exac note-e
		});
		noteViewModel.notes().observe(this, allNotes -> {
			//stex galisa exac note-eere
		});

		View createNoteView = findViewById(R.id.create_note);
		View getNoteView = findViewById(R.id.get_note);
		View getNotesView = findViewById(R.id.get_notes);

		createNoteView.setOnClickListener(view -> noteViewModel.insertNote(new Note()));
		getNoteView.setOnClickListener(view -> noteViewModel.getNote(2));
		getNotesView.setOnClickListener(view -> noteViewModel.getAllNotes());

	}
}
