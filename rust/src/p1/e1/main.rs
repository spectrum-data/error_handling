use std::env::args;
use std::fs::File;
use std::io::Read;
use std::process::exit;

fn main() {
    let args = args().collect::<Vec<String>>();
    let filename = &args[1];
    let mut f = File::open(filename).unwrap();
    let mut buffer = [0u8; 10];
    let size = f.read(&mut buffer).unwrap();
    let content = String::from_utf8_lossy(
        &buffer[0..size]
    );
    let number = content.parse::<i32>().unwrap();
    println!("{} * {} = {}", number, number, number * number);
    exit(0);
}