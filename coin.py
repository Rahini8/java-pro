def coin(n,1,t):
def coin(n,l,t):
	r=1
	a=0
	s=0
	l.sort(reverse=True)
	for i in range(n):
		while(s<t):
			s=s+l[i]
			a=a+1
	print(a)

def main():
	n=int(input())
	t=int(input())
	l=[]
	for i in range(n):
		l.append(int(input()))
	coin(n,l,t)

try:
	main()
except:
	print('invalid')
