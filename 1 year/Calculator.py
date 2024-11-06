while True:
    print('')
    print('')
    print('')
    print('')
    print('Hello welcome to my Calculator')
    print('------------------------------')
    print('')
    print('Pls choose + - * or /')
    print('')

    i = input('Input:  ')

    if i == ('+'):
        x = int(input('First Input:  '))
        y = int(input('Second Input:  '))
        print (x + y)

    if i == ('-'):
        x = int(input('First Input:  '))
        y = int(input('Second Input:  '))
        print (x - y)

    if i == ('*'):
        x = int(input('First Input:  '))
        y = int(input('Second Input:  '))
        print (x * y)

    if i == ('/'):
        x = int(input('First Input:  '))
        y = int(input('Second Input:  '))
        print (x / y)
