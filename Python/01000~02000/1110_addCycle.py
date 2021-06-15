num = int(input(""))
temp = num
cnt = 0

while True :
    num1 = temp // 10
    num2 = temp % 10

    temp = (num2 * 10) + ((num1 + num2) % 10)
    cnt += 1

    if temp == num :
        break

print(cnt)
