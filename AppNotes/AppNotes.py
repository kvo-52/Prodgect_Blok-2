from Note import Note
import csv

class AppNotes:
    def __init__(self) -> None:
        self.notes=[]

    def read_notes(self):
        for note in  self.notes:
            print (f"{note.id}:{note.title}\n Дата создания: {note.created_at}\n")

    def add_note(self, title, content):
        note=Note (title, content)
        note.id =len(self.notes)+1
        self.notes.append(note)
        print ("Заметка добавлена")
        
                