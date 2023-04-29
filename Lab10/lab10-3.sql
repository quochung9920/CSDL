-- Lỗi lặp lại tên cột id
create view customer_sale1 as
select *
from sales s
    join customers c on c.id = s.customer_id;

-- Tạo một view "customer_sale2" sử dụng thuật toán "MERGE". Thuật toán "MERGE" cho phép thêm, cập nhật hoặc xóa dữ liệu trong bảng gốc tương ứng khi thực hiện tương tự trên view.
create algorithm = merge view customer_sale2 as
select c.id
from sales s
    join customers c on c.id = s.customer_id;

-- Tạo một view "customer_sale3" sử dụng thuật toán "TEMPTABLE". Thuật toán "TEMPTABLE" tạo ra một bảng tạm thời từ kết quả truy vấn và sau đó trả về kết quả. View tạo bằng thuật toán "TEMPTABLE" không cho phép thêm, cập nhật hoặc xóa dữ liệu trong bảng gốc.
create algorithm = temptable view customer_sale3 as
select c.id
from sales s
    join customers c on c.id = s.customer_id;


create algorithm = merge view customer_sale4 as
select count(*),
    c.id
from sales s
    join customers c on c.id = s.customer_id;

-- Lệnh trên tạo một view "customer_sale5" với thuật toán "UNDEFINED". Thuật toán "UNDEFINED" cho phép cơ sở dữ liệu sử dụng thuật toán mặc định để xử lý view.
create algorithm = undefined view customer_sale5 as
select count(*),
    c.id
from sales s
    join customers c on c.id = s.customer_id;