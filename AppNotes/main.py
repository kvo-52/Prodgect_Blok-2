from Note import Note
from AppNotes import AppNotes
import datetime

app=AppNotes()

while True:
    command = input("Введите номер команды (1-read, 2-add, 3-save, 4-load, 5-edit, 6-delete, 7-search, 8-exit): ")

    if command == "1":
        app.read_notes()

    elif command == "2":
        title = input("Введите название заметки: ")
        content = input("Введите содержимое заметки: ")
        app.add_note(title, content)

    elif command == "3":
        app.save_notes()

    elif command == "4":
        app.load_notes()

    elif command == "5":
        id = int(input("Введите id заметки: "))
        title = input("Введите название новой заметки: ")
        content = input("Введите новое содержимое заметки: ")
        app.edit_note(id, title, content)

    elif command == "6":
        id = int(input("Введите id заметки: "))
        app.delete_note(id)
    
    elif command == "7":
        start_date = datetime.datetime.strptime(input("Введите начальную дату (в формате ГГГГ-ММ-ДД): "), "%Y-%m-%d").date()
        end_date = datetime.datetime.strptime(input("Введите конечную дату (в формате ГГГГ-ММ-ДД): "), "%Y-%m-%d").date()
        app.search_notes(start_date, end_date)

    elif command == "8":
        break

    else:
        print("Недопустимая команда")
