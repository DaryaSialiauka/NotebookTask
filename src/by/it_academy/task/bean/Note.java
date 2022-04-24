package by.it_academy.task.bean;

import java.time.LocalDate;
import java.util.Objects;

public class Note {

	private String text;
	private LocalDate date;
	
	public Note() {
		this("");
	}
	
	public Note(String text, LocalDate date) {
		this.text = text;
		this.date = date;
	}

	public Note(String text) {
		this.text = text;
		this.date = LocalDate.now();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Note [text=" + text + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(date, other.date) && Objects.equals(text, other.text);
	}

	
}
