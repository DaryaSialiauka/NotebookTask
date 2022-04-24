package by.it_academy.task.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Notebook {
	private String name;
	private List<Note> note;
	
	

	public Notebook() {
		this("test");
	}

	public Notebook(String name) {
		this.name = name;
		this.note = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Note> getNote() {
		return note;
	}

	public void setNote(List<Note> note) {
		this.note = note;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, note);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notebook other = (Notebook) obj;
		return Objects.equals(name, other.name) && Objects.equals(note, other.note);
	}

	@Override
	public String toString() {
		return "Notebook [name=" + name + ", note=" + note + "]";
	}
	

}
