# todolist.py
def create_task(task_list, task_name):
    task_list.append(task_name)


def list_tasks(task_list):
    for index, task in enumerate(task_list, start=1):
        print(f"{index}, {task}")
