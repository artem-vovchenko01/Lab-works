#1.2.1.5
# Введення числа
num = input("Введіть число: ")

# Якщо користувач введе не число, попередити і зупинити програму.
try:
    num = int(num)
except:
    print("Некоректне введення")
    quit()

# Проінформувати користувача, якщо він вгадає щасливе число.
if num == 5:
    print("Моє щасливе число")
elif num > 10:
    print("Занадто багато")
else:
    print("Це не найвдаліше число")
