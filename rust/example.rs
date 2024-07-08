fn main() {
    let a: u128 = 3;
    let b: i32 = 5;
    let c = 10;

    let a: String = "foo".to_string();
    // a owns this String

    let b: String = a.clone();

    println!("{}", a);

    // free(b)
}

