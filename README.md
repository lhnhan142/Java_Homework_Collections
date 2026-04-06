Phần 8: Generic
Bài 8.1: T generic (class)
Tạo class student có property id, name (trong đó id của student có thể là int, long, float)
a) Tạo đối tượng student có id là int
b) Tạo đối tượng student có id là float
c) Tạo đối tượng student có id là double
Bài 8.2: T generic (method)
Tạo method để in ra thông tin nhập vào (parameter) (parameter có thể là họ và tên, hoặc student, hoặc int)
Gợi ý: tạo method print(T a) và cài đặt system out (a) ra
Demo chương trình với print(student), print(4), print(4.0)
Bài 8.3: E generic
Tạo 1 array int, 1 array float, 1 array long, 1 array double. Tạo 1 method có parameter là array và in ra các số trong array đó
Bài 8.4: E generic
Tạo 1 class Employee có property id, name, salaries với salaries là lương các tháng của Employee đó và là 1 array có data type có thể là int, long, float.
Viết method trong Employee để in ra thông tin của Employee bao gồm id, name, salaris.
Viết method trong Employee để in ra thông tin tháng lương cuối cùng của Employee
a) Hãy tạo chương trình demo với Employee có salaries là datatype int
b) Hãy tạo chương trình demo với Employee có salaries là datatype float
c) Hãy tạo chương trình demo với Employee có salaries là datatype double
Bài 8.5: K & V generic
Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value. Tạo các method
a) GetValue()
b) getKey ()
Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên và value là tên của sinh viên đó
Bài 8.6: K & V generic
Tạo 1 class có tên là Phone, lưu dữ liệu theo dạng key, value (extends MyMap)
Với key là email hoặc là số thứ tự hoặc là tên người sử dụng Với value là số điện thoại
Tạo các method
a) GetPhoneNumber()
b) getKey ()
Viết chương trình demo với
a) key là email
b) key là số thứ tự
c) key là tên của người sử dụng
Bài 8.7: K & V generic
Tạo 1 class có tên là Staff, lưu dữ liệu theo dạng key, value (extends MyMap). Với key là id của Staff (ID có thể là int, long)
Với value là tên của Staff
Tạo các method
a) GetId ()
b) getName ()
Viết chương trình demo
Phần 9: Wildcard (Generic)
Bài 9.1: Tạo 1 class Salary để đại diện cho datatype là các số
a) Hãy config class Salary như sau: Salary <N> với N phải được extends từ Number.class
b) Tạo method để print ra salary hiện tại
Bài 9.2: Tạo 1 class MyNumber để đại diện cho datatype là các số. Hãy config class MyNumber như sau: MyNumber<N> với N phải được extends từ Number.class
Bài 9.3: T generic (method) Tạo method tính max của 2 số (số nhập vào có thể là float, double, int, long). Demo chương trình
Bài 9.4: T generic (method & class)
Tạo class MyMath<T> có thể làm việc được với các số int, long, double và có chứa các method sau:
a) tính tổng của 2 số
b) tính tổng của 3 số
c) tính tổng của 4 số
d) tính hiệu của 2 số
e) hàm tính số mũ (a,b)
Gợi ý: sử dụng optional parameter để làm câu a,b,c. Demo chương trình
Bài 9.5: Tạo 1 cursor như sau: ArrayList <Object> listWildcards.
Hãy khởi tạo đối tượng có chứa thông tin của khách hàng (mỗi thông tin là 1 element) và thêm các giá trị vào trong ArrayList như:
a) Nguyễn Văn Nam
b) 30 tuổi
c) Hà đông, Hà nội
