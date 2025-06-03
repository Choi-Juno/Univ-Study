from todolist import create_task, list_tasks, tasks

create_task(tasks, "청소하기")
create_task(tasks, "식료품 쇼핑하기")
create_task(tasks, "운동하기")

print("할 일 목록: ")
list_tasks(tasks)
